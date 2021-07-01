import React from 'react';
import './App.css';
import Layout from './components/Layout'
import Router from './util/Router'
import express from 'express'
import axios from "axios";

class App extends React.Component {
    constructor(props) {
        super(props);
        this.isLoggedIn = false;
        this.userName = '';
        axios.defaults.headers.post['Access-Control-Allow-Origin']='http://localhost:8080';
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