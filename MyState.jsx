import React from "react";

class MyState extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            header: "this is a demo header",
            "myContent": "Hold on for some super awesome content"
        }
    }

    render(){
        return(<div>
            <h1>{this.state.header}</h1>
            <h2>{this.state.myContent}</h2>
        </div>);
    }
}

export default MyState;