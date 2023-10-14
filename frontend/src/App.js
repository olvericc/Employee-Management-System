import HeaderComponent from "./component/HeaderComponent";
import FooterComponent from "./component/FooterComponent";
import ListEmployeeComponent from "./component/ListEmployeeComponent";
import AddEmployeeComponent from "./component/AddEmployeeComponent";
import { BrowserRouter, Routes, Route } from "react-router-dom";

function App() {
   return (
     <BrowserRouter>
       <HeaderComponent />
         <div className="container">
           <Routes>
             <Route path="" element={<ListEmployeeComponent />} />
             <Route path="/employee" element={<AddEmployeeComponent />} />
             <Route path="/add-employee" element={<AddEmployeeComponent />} />
             <Route path="/add-employee/:id" element={<AddEmployeeComponent />} />
           </Routes>
         </div>
         <FooterComponent />
     </BrowserRouter>
  );
}

export default App;
