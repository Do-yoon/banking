import React from 'react';

class Home extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            userName: ""
        }
        this.state.userName = this.getUserName;
    }
    // �����κ��� ���� �̸��� �������� �޼ҵ�
    getUserName() {
        return "Lemon";
    }
    render() {
        return (
            <div>
                Hello, {this.state.userName}!
            </div>
        );
    }
}

export default Home;
