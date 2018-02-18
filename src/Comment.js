import React,{Component} from 'react';
import marked from 'marked';
import style from './style';

class Comment extends Component{
  rawMarkup(){
  let rawMarkup = marked(this.props.children.toString());
  return { __html: rawMarkup };
  }

  render(){
    return(
      <div style={style.comment}>
      <h3>{this.props.author}</h3>
      <span dangerouslySetInnerHTML={this.rawMarkup()}/>
      </div>
    )
  }

}

export default Comment;
