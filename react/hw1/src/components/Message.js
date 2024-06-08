function Message({title, text}) {
    return (
        <div className="message">
            <p className="message-title">{title}</p>
            <p className="message-text">{text}</p>
        </div>
    )
}

export default Message;