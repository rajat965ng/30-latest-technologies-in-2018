import React from 'react';

class FormApp extends React.Component{

    constructor(props){
        super(props);
        this.state = {
            data: "Initial Data"
        }
        this.formUpdateHandler = this.formUpdateHandler.bind(this);
    }

    formUpdateHandler(e){
        this.setState({data:e.target.value});
    }

    render(){
        return(
            <div>
                <input type="text" value={this.state.data} onChange={this.formUpdateHandler} />
                <h4>{this.state.data}</h4>
            </div>
        );
    }

}

export default FormApp;