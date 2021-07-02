import React from 'react'
import TextArea from '../util/Constants';
import validate from "../user/Validate";

class Login extends React.Component {
    constructor(props) {
        super(props);
        this.state = {pw: ''}
        this.login = this.login.bind(this);
        this.handleChange = this.handleChange.bind(this);
        this.loginButton = TextArea.loginButton;
    }

    handleChange(event) {
        if (event.target.name === "userId") {
            this.setState({
                id: event.target.value
            });
        } else {
            this.setState({
                pw: event.target.value
            });
        }
    }

    login(event) {
        const result = validate.signin({id: this.state.id, pw: this.state.pw})
        result
            .then((userName) => {
                window.sessionStorage.setItem("userName", userName);
                alert(userName);
                event.preventDefault();
                window.location.href = "/home";
            })
            .catch((message) => {
                alert(message)
            })
    }

    render() {
        return (
            <div>
                <div>
                    ID<input type="text" name="userId" value={this.state.id} onChange={this.handleChange}/>
                </div>
                <div>
                    PW<input type="password" name="userPw" value={this.state.pw} onChange={this.handleChange}/>
                </div>
                <div>
                    <input type="button" value={this.loginButton} onClick={this.login}/>
                </div>
            </div>
        );
    }
}

export default Login;