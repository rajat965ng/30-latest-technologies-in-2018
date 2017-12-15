import React from 'react';

class ComplexApp extends React.Component{

    constructor(props){
        super(props);

        this.state = {
            data: 'initial data'
        }

        this.setStateHandler = this.setStateHandler.bind(this);
    }

    setStateHandler(e){
        this.setState({data:e.target.value});
    }


    render(){
        return(
            <div>
                <ContentData dataValue={this.state.data} setValue={this.setStateHandler} />
            </div>
        );
    }


}

export default ComplexApp;

class ContentData extends React.Component{

    render(){
        return(
            <div>
                <input type="text" value={this.props.dataValue} onChange={this.props.setValue}/>
                <h3>{this.props.dataValue}</h3>
            </div>
        );
    }

}