const http = require('http');
const server = http.createServer(function(req, res) {
    if (req.url == '/home') {
        res.write(" Hello World to Cloud ");
        res.end();
    } else {
        res.write(" EMPTY PAGE");
        res.end();
    }
});
server.listen(8000);