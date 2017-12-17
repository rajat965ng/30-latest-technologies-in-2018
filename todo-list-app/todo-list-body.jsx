import _ from 'lodash'
import React from 'react';
import { todos } from '../App.jsx'

class TodoListBody extends React.Component{

    renderItems(){
        return _.map(this.props.todos, (todo,index) => <TodoListItem key={index} {...todo}/>)
    }



    render(){
        return(<tbody>
        {this.renderItems()}
        </tbody>)
    }
}

export  default TodoListBody



class TodoListItem extends React.Component{
    constructor(props){
        super(props);

        this.state = {
            isEditing: false
        };

        this.onEditHandler = this.onEditHandler.bind(this);
        this.onCancelHandler = this.onCancelHandler.bind(this);
    }

    rendersActionsSection(){
        if(this.state.isEditing){
            return(<td>
                <button>Save</button>
                <button onClick={this.onCancelHandler}>Cancel</button>
            </td>);
        }

        return(<td>
            <button onClick={this.onEditHandler}>Edit</button>
            <button>Delete</button>
        </td>);
    }

    rendersTaskSection(){
        const {task,completed} = this.props;
        console.log(completed)
        const myStyle = {
            color: completed?'green':'red',
            cursor: 'pointer'
        }
        return(<td style={myStyle}>{task}</td>);
    }

    render(){
        return(<tr>
            {this.rendersTaskSection()}
            {this.rendersActionsSection()}

        </tr>);
    }



    onEditHandler(){
        this.setState({isEditing: true});
    }
    onCancelHandler(){
        this.setState({isEditing: false})
    }
}
