# GodType
GodType is a very simple Bukkit plugin to allow the console (or a player) to chat as a defined name.

## Config
A config.yml file will be created when the plugin is first run.

Defaults:
```yml
color: dark_red
name: GOD
bold: true
chatTypeColon: false
```
`color:` choices are `black, dark_blue, dark_green, dark_aqua, dark_red, dark_purple, gold, gray, dark_gray, blue, green, aqua, red, light_purple, yellow, white`

`name:` is the name that will be displayed in chat.

`bold:` true or false. Defines whether or not the name will be in bold.

`chatTypeColon:` true or false. `false`: the name will be formatted in the vanilla server style: ![vanilla](https://cdn.novlc.io/images/png/0h4wf.png)
`true`: the message will be formatted in a style more like Hypixel: ![vanilla](https://cdn.novlc.io/images/png/Jch4D.png)

## Usage
For users:
1. Download the most recent jarfile from releases
2. Put the file in the plugins folder of your server
3. Restart the server to generate the config
5. Edit the config according to the Config section above, if you choose. The server needs to be restarted to apply the changes, as  there is no reload command.

For developers:
1. Clone, fork, or do whatever. Project files are included for Eclipse.
