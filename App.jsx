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
            todos:todos,
            errorMessage:null
        }
    }

    render() {
        return (
            <div>
               <h1>React Todo App</h1>
                <CreateTodo validateTask={this.validateTask.bind(this)} createTask={this.createTask.bind(this)}/>
                {this.renderError()}
                <TodoList todos={this.state.todos}
                          toggletask={this.toggleTask.bind(this)}
                          savetask={this.savetask.bind(this)}
                          deletetask={this.deleteTask.bind(this)}/>
            </div>
        );
    }

    renderError(){

            return(<div><h4 style={{color:'red'}}>{this.state.errorMessage}</h4></div>);

    }

    validateTask(task){
        if(task!=null && task!=''){

            const oldtask = _.find(this.state.todos,todo => todo.task === task);
            if(oldtask!=null){
                this.state.errorMessage = 'Entry already exist';
            }else {
                this.state.errorMessage = null;
            }
        }else {
            this.state.errorMessage = 'Entry cannot be null';
        }
        this.setState({errorMessage:this.state.errorMessage})
        if(this.state.errorMessage!=null){
            return false;
        }else {
            return true;
        }
    }

    toggleTask(task){
        const findTask = _.find(this.state.todos,todo => todo.task === task)
        findTask.completed = !findTask.completed
        this.setState({todos: this.state.todos});
    }

    savetask(oldtask,newtask){
        const findTask = _.find(this.state.todos,todo => todo.task === oldtask)
        findTask.task = newtask
        this.setState({todos: this.state.todos})
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

    deleteTask(task){
        _.remove(this.state.todos,todo => todo.task === task);
        this.setState({todos: this.state.todos});
    }
}


export default App;
