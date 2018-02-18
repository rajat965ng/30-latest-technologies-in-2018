import React,{Component} from 'react';
import CommentList from './CommentList';
import CommentForm from './CommentForm';
import style from './style';
import axios from 'axios';

class CommentBox extends Component{

  constructor(props){
    super(props);

    this.state = {
      data:[]
    };

    this.loadCommentFromServer = this.loadCommentFromServer.bind(this);
    this.handleCommentSubmit = this.handleCommentSubmit.bind(this);
  }

  loadCommentFromServer(){
    axios.get(this.props.url).then((res)=>{
      this.setState({data:res.data})
    })
  }

  handleCommentSubmit(comment) {
    let comments = this.state.data;
    comment.id = Date.now();
    let newComment = comments.concat([comment]);
    this.setState({data:newComment});
   console.log(this.props);
   axios.post(this.props.url,comment)
  .catch((err)=>{
     console.error(err);
     this.setState({data:comments});
   })
  }

  componentDidMount(){
    this.loadCommentFromServer();
    setInterval(this.loadCommentFromServer,this.props.pollInterval);
  }

      render() {
        return (
          <div style={style.commentBox}>
          <h2>Comments:</h2>
          <CommentList data={this.state.data} />
          <CommentForm onCommentSubmit={this.handleCommentSubmit}/>
          </div>
        );
      }

}

export default CommentBox;
