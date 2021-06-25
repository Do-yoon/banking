import React from 'react';
import Home from './Home';

class LoginPage extends React.Component {

    login(formData) {
        this.setState(() => {
            return {isLoggedIn: true}
        });
        return <Home />
    }
    render() {
        return (
            <div>
                <form method="post" onSubmit={this.login}>
                    <table>
                        <tr>
                            <td>ID</td>
                            <td><input type="text" name="id" /></td>
                        </tr>
                        <tr>
                            <td>PW</td>
                            <td><input type="text" name="pw" /></td>
                        </tr>
                        <tr>
                            <td><input type='submit' value='·Î±×ÀÎ' /></td>
                        </tr>
                    </table>
                </form>
            </div>
        );
    }
};


export default LoginPage;