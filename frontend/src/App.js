import HeaderComponent from "./component/HeaderComponent";
import FooterComponent from "./component/FooterComponent";
import ListEmployeeComponent from "./component/ListEmployeeComponent";
import AddEmployeeComponent from "./component/AddEmployeeComponent";

function App() {
  return (
    <div>
        <HeaderComponent/>
        <AddEmployeeComponent/>
        <ListEmployeeComponent/>
        <FooterComponent/>
    </div>
  );
}

export default App;
