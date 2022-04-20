const electron = require('electron');

const url = require('url');
const path = require('path');
//const { electron } = require("process");

const {app, BrowserWindow, Menu, ipcMain} = electron;

let win = null;
let createWindow;
app.on('ready', function(){
    //create new window
    win = new BrowserWindow({
        webPreferences:{
            nodeIntegration: true
        }
    });
    //load html into window
    win.loadURL(url.format({
        pathname: path.join(__dirname, 'index.html'),
        protocol:'file',
        slashes: true
    }));
    //QUIT APP WHEN CLOSED
    win.on('close', function(){
        app.quit();
    });

    //build menu from template
    const mainMenu = Menu.buildFromTemplate(mainMenuTemplate)
    //insert menu
    Menu.setApplicationMenu(mainMenu);
});

//handle creating account
function createAccWindow(){
    //creatre new window
    createWindow = new BrowserWindow({
        width: 300,
        height: 200,
        title:'Create User Menu',
        webPreferences:{
            nodeIntegration: true
        }
    });
    //load html into window
    createWindow.loadURL(url.format({
        pathname: path.join(__dirname, 'createWindow.html'),
        protocol:'file',
        slashes: true
    }));
    //Garbage collection handling
    createWindow.on('close', function(){
        createWindow = null;
    })
}

//Catch item:create account
ipcMain.on('potentialUser:add', function(e, item){
    //send information to wherever is needed
});

//create menu template
const mainMenuTemplate = [
    {
    label: 'File',
    submenu:[
        {
            label: 'Create Account',
            click(){
                createAccWindow();
            }
        },
        {
            label: 'Quit',
            accelerator: process.platform == 'darwin' ? 'Command+Q' : 'Ctrl+Q',
            click(){
                app.quit();
            }
        }
    ]
    }
];

//if Mac, add empty object to menu template
if(process.platform == 'darwin'){
    mainMenuTemplate.unshift({});
}

//add Developer tools if not in production mode
if(process.env.NODE_ENV !== 'production'){
    mainMenuTemplate.push({
        label: 'Developer Tools',
        submenu:[
            {
                label: 'Toggle DevTools',
                accelerator: process.platform == 'darwin' ? 'Command+I' : 'Ctrl+I',
                click(item, focusedWindow){
                    focusedWindow.toggleDevTools();
                }
            },
            {
                role: 'reload'
            }
        ]
    });
}