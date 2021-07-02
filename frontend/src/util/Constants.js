const TextArea = {
    logoutButton: "로그아웃",
    hello: (userName) => `Hello, ${userName}!`,
    loginButton: "로그인",
    pleaseSignIn: "Please sign in",
    footer: ""
}

export const urls = {
    signin: "/signin",
    signup: "/signup",
    signout: "/signout",
    withdraw: "/withdraw"
}

export const baseurl = (!process.env.NODE_ENV || process.env.NODE_ENV === 'development' ?
    'http://localhost:8080' :
    'http://localhost:8080')

export default TextArea;