import _ from 'lodash'
import React from 'react';
import { todos } from '../App.jsx'

class TodoListBody extends React.Component{

    renderItems(){
        const props = _.omit(this.props,'todos')
        return _.map(this.props.todos, (todo,index) => <TodoListItem key={index} {...todo}
                                                                     toggletask={this.props.toggletask}
                                                                     savetask={this.props.savetask}
                                                                     deletetask={this.props.deletetask}/>)
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
        this.onSaveHandler = this.onSaveHandler.bind(this);
        this.onDeleteHandler = this.onDeleteHandler.bind(this);
    }

    rendersActionsSection(){
        if(this.state.isEditing){
            return(<td>
                <button onClick={this.onSaveHandler}>Save</button>
                <button onClick={this.onCancelHandler}>Cancel</button>
            </td>);
        }

        return(<td>
            <button onClick={this.onEditHandler}>Edit</button>
            <button onClick={this.onDeleteHandler}>Delete</button>
        </td>);
    }

    rendersTaskSection(){
        const {task,completed} = this.props;
        console.log(this.props.toggletask)
        const myStyle = {
            color: completed?'green':'red',
            cursor: 'pointer'
        }
        if(this.state.isEditing){
            return(<td>
                <form onSubmit={this.onSaveHandler.bind(this)}>
                    <input type="text" defaultValue={task} ref="editInput" />
                </form>
            </td>);
        }
        return(<td style={myStyle} onClick={this.props.toggletask.bind(this,task)}>{task}</td>);
    }

    render(){
        return(<tr>
            {this.rendersTaskSection()}
            {this.rendersActionsSection()}

        </tr>);
    }

    onDeleteHandler(){
        const task = this.props.task;
        this.props.deletetask(task);
    }

    onEditHandler(){
        this.setState({isEditing: true});
    }
    onCancelHandler(){
        this.setState({isEditing: false})
    }
    onSaveHandler(event){
        event.preventDefault();
        const oldtask = this.props.task;
        const newtask = this.refs.editInput.value;
        this.props.savetask(oldtask,newtask);
        this.setState({isEditing: false})
    }
}
