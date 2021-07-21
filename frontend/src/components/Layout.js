import React from 'react';
import Footer from './Footer';
import Header from './Header';
import '@css/Layout.css'

function Layout(props) {
    return (
        <div>
            <Header style="header" />
            <main>
                {props.children}
            </main>
            <Footer style="footer" />
        </div>
    );
}

export default Layout;