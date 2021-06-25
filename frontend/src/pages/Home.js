import React from 'react';
import Header from '../components/Header'
import Footer from '../components/Footer'

function MainPage(userName) {
    return <p>Main page</p>
}


class Home extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            userName: ""
        }
        this.state.userName = this.getUserName;
    }
    // 서버로부터 유저 이름을 가져오는 메소드
    getUserName() {
        return "Lemon";
    }
    render() {
        return (
            <div>
                <MainPage userName={this.state.userName} />
            </div>
        );
    }
}

export default Home;
