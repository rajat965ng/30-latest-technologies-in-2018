import React,{Component} from 'react';
import Comment from './Comment';
import style from './style.js';

class CommentList extends Component{
  render(){
    let commentNodes = this.props.data.map(comment=>{
      return(
        <Comment author={comment.author} key={comment['_id']}>
          {comment.text}
        </Comment>
      )
    })

    return(
      <div style={style.commentList}>
        {commentNodes}
      </div>
    )

  }
}

export default CommentList;
