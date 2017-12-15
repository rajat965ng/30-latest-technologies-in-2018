import React from 'react';
import {BrowserRouter,Link, Switch, Route} from 'react-router-dom'

class RouterApp extends React.Component{

    render(){
        return(
            <BrowserRouter>
                <MyApp/>
            </BrowserRouter>
        );
    }

}

export default RouterApp;

const MyApp = () => (
        <div>
            <Header/>
            <Main/>
        </div>
)

const Header = () => (
    <header>
        <nav>
            <ul>
                <li><Link to='/'>Home</Link></li>
                <li><Link to='/roster'>Roster</Link></li>
                <li><Link to='/schedule'>Schedule</Link></li>
            </ul>
        </nav>
    </header>
)

const Home = () => (
    <div>
        <h1>Welcome to the Tornadoes Website!</h1>
    </div>
)

const Main = () => (
    <main>
        <Switch>
            <Route exact path='/' component={Home}/>
            <Route path='/roster' component={Roster}/>
            <Route path='/schedule' component={Schedule}/>
        </Switch>
    </main>
)

const Schedule = () => (
    <div>
        <ul>
            <li>6/5 @ Evergreens</li>
            <li>6/8 vs Kickers</li>
            <li>6/14 @ United</li>
        </ul>
    </div>
)

const Roster = () => (
    <div>
        <ul>
            <li>Roster 1</li>
            <li>Roster 2</li>
            <li>Roster 3</li>
        </ul>
    </div>
)