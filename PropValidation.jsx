import React from 'react';
import PropTypes from 'prop-types';

class PropValidation extends React.Component{

    render(){
        return(
            <div>
                <h2>{this.props.propArray}</h2>
                <h2>{this.props.propFunc(343)}</h2>
            </div>
        );
    }

}


PropValidation.propTypes = {
    propArray: PropTypes.array.isRequired,
    propBool: PropTypes.bool.isRequired,
    propFunc: PropTypes.func,
    propNumber: PropTypes.number,
    propString: PropTypes.string,
    propObject: PropTypes.object
}

PropValidation.defaultProps = {
    propArray: [1,2,3,4,5],
    propBool: true,
    propFunc: function(e){return e*e},
    propNumber: 1,
    propString: "Nexus",
    propObject: {
        obj1:"TCS",
        obj2:"infosys",
        obj3:"wipro"
    }

}


export default PropValidation;