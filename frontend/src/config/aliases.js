const aliases = (prefix = `src`) => ({
    '@components' : `${prefix}/components`,
    '@config': `${prefix}/config`,
    '@css': `${prefix}/css`,
    '@util': `${prefix}/util`,
    '@pages': `${prefix}/pages`,
    '@user': `${prefix}/user`,
});

module.exports = aliases;