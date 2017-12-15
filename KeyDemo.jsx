import React from 'react';


class KeyDemo extends React.Component{

    constructor(props){
        super(props);

        this.state = {
            data: [
                {
                    "id": 1,
                    "ename": "Java"
                },
                {
                    "id": 2,
                    "ename": "Linux"
                },
                {
                    "id": 3,
                    "ename": "Unix"
                }
            ]
        }

    }

    render(){
        return(
            <div>
                <table>
                    {this.state.data.map((p,i) => <Content key={i} contentdata={p}/>)}
                </table>
            </div>
        );
    }

}

export default KeyDemo;


class Content extends React.Component{

    render(){
        return(
            <tbody>
            <tr>
                <td>{this.props.contentdata.id}</td>
                <td>{this.props.contentdata.ename}</td>
            </tr>
            </tbody>);
    }

}