# IntervalMessages

IntervalMessages is a simple Minecraft plugin that sends random messages to all players on the server at set intervals. You can customize the name that appears in the chat and the list of messages to send.

## Features

- Sends random messages at intervals
- Customize the name that messages are sent from
- Easy configuration in `config.yml`

## Configuration

Here is an example of what the `config.yml` file looks like:

```yaml
interval: 60 # interval between messages in seconds
name: "&r[&Server&r]" # name that shows when the message is sent
messages: # list of messages to randomly pick from to send
  - "test!"
  - "IntervalMessages is awesome!"
```

- **interval**: Time in seconds between messages.
- **name**: The name that appears in the chat (supports color codes).
- **messages**: List of messages to randomly choose from.

## Usage

Once the plugin is installed and configured, it will automatically start sending messages at the interval you set.

Enjoy your server messages!
