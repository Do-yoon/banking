import React from 'react';
import './App.css';
import Layout from './components/Layout'
import Home from './pages/Home';
import Router from './util/Router'

class App extends React.Component {
    constructor(props) {
        super(props);
        this.isLoggedIn = false;
        this.userName = '';
    }
    render() {
        return (
            <div className="app">
                <Layout>
                    <Router />
                </Layout>
            </div>
        );
    }
}

export default App;