import React from 'react';
import ReactDom from 'react-dom';

class SetStateApp extends React.Component{

    constructor(){
        super();
        this.state = {
            data: []
        }
        this.setStateHandler = this.setStateHandler.bind(this);
    };

    setStateHandler(){
        var item = "Once More";
        var myArray = this.state.data;
        myArray.push(item);
        this.setState({data:myArray});
    };


    render(){
        return(<div>
            <button onClick={this.setStateHandler}>Click Here</button>
            <h4>{this.state.data}</h4>
            <ForceUpdateApp />
            <FindDomNodeApp />
        </div>);
    }

}

export default SetStateApp;


class ForceUpdateApp extends React.Component{

    constructor(){
        super();

        this.forceUpdateHandler = this.forceUpdateHandler.bind(this);
    };

    forceUpdateHandler(){
        this.forceUpdate();
    };

    render(){
        return(
            <div id="upid">
            <button onClick={this.forceUpdateHandler}>Update</button>
            <h4>{Math.random()}</h4>
        </div>);
    }

}

class FindDomNodeApp extends React.Component{

    constructor(){
        super();
        this.findDomNodeApp = this.findDomNodeApp.bind(this);
    }

    findDomNodeApp(){
        var myNode = document.getElementById('myNode');
        ReactDom.findDOMNode(myNode).style.color = "green";
    }

    render(){
        return(
            <div>
                <button onClick={this.findDomNodeApp}>Change Color</button>
                <div id='myNode'>Hello Node !!</div>
            </div>
        );
    }


}