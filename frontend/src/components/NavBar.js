const NavBar = () => {
    return (
        <div className="nav-bar">
            <a href="/" className="nav-bar nav-button">Profile</a>
            <div></div>
        </div>
    );
}

const showCategory = () => {
    const path = require('@util/Constants.js');
    path.categories.map((category) => <div>{category}</div>)
}

export default NavBar;