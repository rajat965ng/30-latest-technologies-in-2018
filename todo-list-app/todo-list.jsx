import React from 'react'
import TodoListHeader from './todo-list-header.jsx';
import TodoListBody from "./todo-list-body.jsx";

class TodoList extends React.Component{

    render(){

        return(<div>
            <table>
                <TodoListHeader/>
                <TodoListBody todos={this.props.todos}/>
            </table>
        </div>);
    }

}

export default TodoList;