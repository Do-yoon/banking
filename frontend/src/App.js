import React from 'react';
import './App.css';
import Footer from './components/Footer';
import Header from './components/Header';
import LoginPage from './pages/LoginPage';
import Router from './util/Router'
import Home from './pages/Home'

class App extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            isLoggedIn: false
        }
    }
    render() {
        return (
            <div className="app">
                <Router />
                <Header isLoggedIn={this.state.isLoggedIn} />
                <Home isLoggedIn={this.state.isLoggedIn} />
                <Footer />
            </div>
        );
    }
}

export default App;