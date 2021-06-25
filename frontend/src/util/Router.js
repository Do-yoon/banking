import React from 'react';
import { BrowserRouter, Redirect, Route, Routes } from 'react-router-dom';
import LoginPage from '../pages/LoginPage';
import Home from '../pages/Home'
import App from '../App'

function Router() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/login" component={<LoginPage />} />
                {/*<LoginRedirect path="/home" Component={<Home />} />*/}
                <Route path="/" component={<App />} />
            </Routes>
        </BrowserRouter>
    );
}
/*
const LoginRedirect = (path, Component) => {
    return (
        <Route path={path} render={props =>
            localStorage.getItem("isLoggedIn") ?
                (<Component {...props} />) :
                (<LoginPage />)
        }/>
    );
}
*/

export default Router;