import React from 'react';
import { Link } from 'react-router-dom';
import TextArea from '../util/Constants';

function LoginButton(props) {
    return (
        <Link to="/signin">
            <button onClick={props.onClick}>
                {TextArea.loginButton}
            </button>
        </Link>
    );
}

function LogoutButton(props) {
    return (
        <button onClick={props.onClick}>
            {TextArea.logoutButton}
        </button>
    );
}

class Header extends React.Component {
    constructor(props) {
        super(props);
        this.handleLoginClick = this.handleLoginClick.bind(this);
        this.handleLogoutClick = this.handleLogoutClick.bind(this);
        this.state = { isLoggedIn: false };
    }

    loginControl(isLoggedIn) {
        const userName = this.props.userName;
        return (
            <div>
                {isLoggedIn ? TextArea.hello + userName : TextArea.pleaseSignIn}
                {isLoggedIn ? <LogoutButton onClick={this.handleLogoutClick} /> : <LoginButton onClick={this.handleLoginClick} />}
            </div>
        );
}

    handleLoginClick() {
        this.setState({ isLoggedIn: true });
    }

    handleLogoutClick() {
        this.setState({ isLoggedIn: false });
    }

    render() {
        return this.loginControl(this.props.isLoggedIn);
    }
}

export default Header;