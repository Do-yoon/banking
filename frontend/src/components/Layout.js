import React from 'react';
import Footer from './Footer';
import Header from './Header';
import '@css/Layout.css'
import NavBar from "./NavBar";

function Layout(props) {
    return (
        <div>
            <Header style="header" />
            <NavBar/>
            <main>
                {props.children}
            </main>
            <Footer style="footer" />
        </div>
    );
}

export default Layout;