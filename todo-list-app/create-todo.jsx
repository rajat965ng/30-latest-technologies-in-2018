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
        if(this.props.validateTask(this.refs.createInput.value)) {
            this.props.createTask(this.refs.createInput.value)
            this.refs.createInput.value = "";
        }
    }

}

export default CreateTodo;