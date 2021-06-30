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
        this.setState({
            id: event.target.name.userId,
            pw: event.target.name.userPw
        });
    }
    login(event) {
        if(validate.signin({id: this.state.id, pw: this.state.pw})) {
            event.preventDefault();
            window.setTimeout(() => {
                window.location.href = "/home"
            }, 3000);
        } else {
            alert('nono');
        }
    }
    render() {
        return (
            <div>
                <form method="post" onSubmit={this.login}>
                    <table>
                        <tbody>
                            <tr>
                                <td>ID</td>
                                <td><input type="text" name="userId" value={this.state.id} onChange={this.handleChange}/></td>
                            </tr>
                            <tr>
                                <td>PW</td>
                                <td><input type="text" name="userPw" value={this.state.id} onChange={this.handleChange}/></td>
                            </tr>
                            <tr>
                                <td><input type="submit" value={this.loginButton} /></td>
                            </tr>
                        </tbody>
                    </table>
                </form>
            </div>
        );
    }
}

export default Login;