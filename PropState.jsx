import React from 'react';


class PropState extends React.Component{
    constructor(props){
        super(props);

        this.state = {
            "header":"The header is displayed !!",
            "content":"The content is up and running !!"
        }
    }

    render(){
        return(
            <div>
                <Header myheader={this.state.header}/>
                <Content mycontent={this.state.content} />
            </div>
        );
    }
}

export default PropState;

class Header extends React.Component{
    render(){
        return(
            <div>
            <h1>{this.props.myheader}</h1>
            </div>
        );
    }
}

class Content extends React.Component{
    render(){
        return(
            <div>
            <h2>{this.props.mycontent}</h2>
            </div>
        );
    }
}