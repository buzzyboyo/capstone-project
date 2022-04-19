const {app, BrowserWindow} = require("electron");

let win = null;

const createWindow = () => {
    win = new BrowserWindow({
        width: 1280,
        height: 720,
        resizable: false,
        webPreferences: {
            nodeIntegration: true
        },
    });

    win.loadFile("index.html")//load html file that will have all of the front end stuff
};

app.whenReady().then(createWindow);