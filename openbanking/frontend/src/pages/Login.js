function Login(props) {
    return (
        <div>
            <form method="post">
                <table>
                    <tr>
                        <td>ID</td>
                        <td><input type="text" name="id" /></td>
                    </tr>
                    <tr>
                        <td>PW</td>
                        <td><input type="text" name="pw" /></td>
                    </tr>
                </table>
            </form>
        </div>
    );
}

export default Login;