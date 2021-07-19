import React from 'react';
import Footer from './Footer';
import Header from './Header';
import {HeaderStyle, FooterStyle} from '../css/LayoutStyle'

function Layout(props) {
    return (
        <div>
            <Header className={HeaderStyle} />
            <main>
                {props.children}
            </main>
            <Footer className={FooterStyle}/>
        </div>
    );
}

export default Layout;