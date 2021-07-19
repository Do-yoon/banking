import React, {useState} from 'react';
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

function Header(props) {
    const session = window.sessionStorage;
    const [userName, setUserName] = useState(session.getItem("userName"));


    const handleLoginClick = () => {
        const userName = session.getItem("userName");
        if (userName) {
            setUserName(userName);
        } else {
            window.location.href = "/signin";
        }
    }

    const handleLogoutClick = () => {
        session.setItem("userName", null);
        setUserName(null);
    }

    return (
        <div>
            {userName ? TextArea.hello(userName) : TextArea.pleaseSignIn}
            {userName ? <LogoutButton onClick={handleLogoutClick} /> : <LoginButton onClick={handleLoginClick} />}
        </div>
    );

}

export default Header;