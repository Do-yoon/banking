import React from 'react';
import { Redirect, Route, Routes} from 'react-router-dom';
import LoginPage from '../pages/LoginPage';
import Home from '../pages/Home'
import App from '../App'
import Layout from '../components/Layout';

function Router() {
    return (
        <Routes>
            <Route path="/login" >
                <LoginPage />
            </Route>
            {/*<LoginRedirect path="/home" Component={<Home />} />*/}
            <Route path="/" component={App}>
                <Home/>
            </Route>
        </Routes>
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