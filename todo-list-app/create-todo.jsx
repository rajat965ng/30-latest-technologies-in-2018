import React from 'react';

class CreateTodo extends React.Component{


    render(){
        return(<div>
            <form onSubmit={this.handleCreate.bind(this)}>
            <input placeholder="What to do next ?" type="text" ref="createInput"/>
            <button>Create</button>
            </form>
        </div>);
    }


    handleCreate(event){
        event.preventDefault();
        console.log(this.refs.createInput.value);
        console.log(this.props.createTask);
        this.props.createTask(this.refs.createInput.value)
        this.refs.createInput.value = "";
    }

}

export default CreateTodo;