import React from 'react'

class PropView extends React.Component{

    render(){
        return(
            <div>
            <h1>{this.props.id}</h1>
            <h2>{this.props.name}</h2>
            </div>
        );
    }

}

PropView.defaultProps = {
    id: 2,
    name: "Facebook"
}

export default PropView;