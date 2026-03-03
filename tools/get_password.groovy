// Source - https://stackoverflow.com/a/30953269
// Posted by tartakynov, modified by community. See post 'Timeline' for change history
// Retrieved 2026-03-03, License - CC BY-SA 4.0

import hudson.util.Secret

def secret = Secret.fromString("zlvnUMF1/hXwe3PLoitMpQ6BuQHBJ1FnpH7vmMmQ2qk=")
println(secret.getPlainText())

