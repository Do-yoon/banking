import React from 'react';
import { Link } from 'react-router-dom';
import TextArea from '../util/Constants';

function LoginButton(props) {
    return (
        <button onClick={props.onClick}>
            {TextArea.loginButton}
        </button>
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
        this.session = window.sessionStorage;
        this.state = { userName: (this.session.getItem("userName")) };
    }

    loginControl() {
        return (
            <div>
                {this.state.userName ? TextArea.hello(this.state.userName) : TextArea.pleaseSignIn}
                {this.state.userName ? <LogoutButton onClick={this.handleLogoutClick} /> : <LoginButton onClick={this.handleLoginClick} />}
            </div>
        );
}

    handleLoginClick() {
        const userName = this.session.getItem("userName");
        if (userName) {
            this.setState({userName: userName});
        } else {
            window.location.href = "/signin";
        }
    }

    handleLogoutClick() {
        this.session.setItem("userName", null);
        this.setState({ userName: null });
    }

    render() {
        return this.loginControl();
    }
}

export default Header;