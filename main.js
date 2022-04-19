const electron = require('electron');

const url = require('url');
const path = require('path');
//const { electron } = require("process");

const {app, BrowserWindow, Menu} = electron;

let win = null;

app.on('ready', function(){
    //creatre new window
    win = new BrowserWindow({});
    //load html into window
    win.loadURL(url.format({
        pathname: path.join(__dirname, 'index.html'),
        protocol:'file',
        slashes: true
    }));

    //build menu from template
    const mainMenu = Menu.buildFromTemplate(mainMenuTemplate)
    //insert menu
    Menu.setApplicationMenu(mainMenu);
});

const mainMenuTemplate = [
    {
    label: 'File',
    submenu:[
        {
            label: 'Quit',
            click(){
                app.quit();
            }
        }
    ]
    }
];

/*const createWindow = () => {
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

app.whenReady().then(createWindow);*/