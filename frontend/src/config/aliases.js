const aliases = (prefix = `src`) => ({
    '@components' : `${prefix}/components`,
    '@config': `${prefix}/config`,
    '@css': `${prefix}/css`,
    '@utils': `${prefix}/utils`,
    '@pages': `${prefix}/pages`,
    '@users': `${prefix}/users`,
});

module.exports = aliases;