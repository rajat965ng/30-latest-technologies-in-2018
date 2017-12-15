import React from 'react';

class Joint extends React.Component{

    render(){
        return(<div>
            <Header/>
            <Content/>
        </div>);
    }

}

export default Joint;



class Header extends React.Component{

    render(){
      return(<h3>
          This is Header
      </h3>);
    }

}

class Content extends React.Component{
    constructor(){
        super();
        this.state = {
            data: [
                {
                    "id":1,
                    "name":"Java"
                },
                {
                    "id":2,
                    "name":"Python"
                },
                {
                    "id":3,
                    "name":"Scala"
                }
            ]
        }
    }

    render(){
        return(<div>
            <table>
                <header></header>
                <tbody>
                {this.state.data.map((p,i) => <TableRow key ={i} data={p}/> )}
                </tbody>
            </table>
        </div>);
    }
}

class TableRow extends React.Component{

        render(){
        return(
            <tr>
                <td>{this.props.data.id}</td>
                <td>{this.props.data.name}</td>
            </tr>
        );
        }
}

