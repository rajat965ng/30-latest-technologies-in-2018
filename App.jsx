import React from 'react'
import TodoList from "./todo-list-app/todo-list.jsx";
import CreateTodo from "./todo-list-app/create-todo.jsx";

const todos = [
    {
        task: 'make react tutorial',
        completed: false
    },
    {
        task: 'eat dinner',
        completed: true
    }
]

class App extends React.Component {
    constructor(props){
        super(props);
        this.state = {
            todos:todos
        }
    }

    render() {
        return (
            <div>
               <h1>React Todo App</h1>
                <CreateTodo createTask={this.createTask.bind(this)}/>
                <TodoList todos={this.state.todos}/>
            </div>
        );
    }

    createTask(task){
        this.state.todos.push(
            {
                task: task,
                isCompleted: false
            }
        );
        this.setState({todos: this.state.todos})
    }
}

export default App;
