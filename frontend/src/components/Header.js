import React from 'react';

class Header extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            isLoggedIn: false
        }
    }
    render() {
        console.log(this.state)
        if (this.props.isLoggedIn) {
            return (<p>hello, 111</p>);
        } else {
            return (<p>Please Login</p>);
        }
    }
}

export default Header;