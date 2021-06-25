import React from 'react';
import Footer from './Footer';
import Header from './Header';

class Layout extends React.Component {
    render() {
        return (
            <div>
                <Header />
                <main>
                    {this.props.children}
                </main>
                <Footer />
            </div>
        );
    }
}

export default Layout;