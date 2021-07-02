import React from 'react';

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
