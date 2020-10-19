/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.16).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.CategoryDTO;
import io.swagger.model.CategoryListDTO;
import io.swagger.model.CustomerDTO;
import io.swagger.model.CustomerListDTO;
import io.swagger.model.VendorDTO;
import io.swagger.model.VendorListDTO;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-19T14:01:38.522Z")

@Api(value = "api", description = "the api API")
@RequestMapping(value = "")
public interface ApiApi {

    @ApiOperation(value = "createNewCustomer", nickname = "createNewCustomerUsingPOST", notes = "", response = CustomerDTO.class, tags={ "customer-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CustomerDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/v1/customers",
        produces = { "*/*" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<CustomerDTO> createNewCustomerUsingPOST(@ApiParam(value = "customerDTO" ,required=true )  @Valid @RequestBody CustomerDTO customerDTO);


    @ApiOperation(value = "The POST-Operation will return a 'HttpStatus.CREATED' and create a new vendor.", nickname = "createNewCustomerUsingPOST1", notes = "", response = VendorDTO.class, tags={ "vendor-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = VendorDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/v1/vendors",
        produces = { "*/*" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<VendorDTO> createNewCustomerUsingPOST1(@ApiParam(value = "vendorDTO" ,required=true )  @Valid @RequestBody VendorDTO vendorDTO);


    @ApiOperation(value = "deleteCustomer", nickname = "deleteCustomerUsingDELETE", notes = "", tags={ "customer-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/v1/customers/{id}",
        produces = { "*/*" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteCustomerUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "The DELETE-Operation with 'id' will delete the vendor with the given id and return back a 'HttpStatus.OK'.", nickname = "deleteVendorUsingDELETE", notes = "", tags={ "vendor-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/v1/vendors/{id}",
        produces = { "*/*" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteVendorUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllCategories", nickname = "getAllCategoriesUsingGET", notes = "", response = CategoryListDTO.class, tags={ "category-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CategoryListDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/v1/categories",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    ResponseEntity<CategoryListDTO> getAllCategoriesUsingGET();


    @ApiOperation(value = "This will get a list of customers.", nickname = "getAllCustomersUsingGET", notes = "These are some notes about the API that we can customize.", response = CustomerListDTO.class, tags={ "customer-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CustomerListDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/v1/customers",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    ResponseEntity<CustomerListDTO> getAllCustomersUsingGET();


    @ApiOperation(value = "getCategoryByName", nickname = "getCategoryByNameUsingGET", notes = "", response = CategoryDTO.class, tags={ "category-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CategoryDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/v1/categories/{name}",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    ResponseEntity<CategoryDTO> getCategoryByNameUsingGET(@ApiParam(value = "name",required=true) @PathVariable("name") String name);


    @ApiOperation(value = "getCustomerById", nickname = "getCustomerByIdUsingGET", notes = "", response = CustomerDTO.class, tags={ "customer-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CustomerDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/v1/customers/{id}",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    ResponseEntity<CustomerDTO> getCustomerByIdUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "The GET-Operation with 'id' will list the vendor with the given id.", nickname = "getVendorByIdUsingGET", notes = "", response = VendorDTO.class, tags={ "vendor-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VendorDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/v1/vendors/{id}",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    ResponseEntity<VendorDTO> getVendorByIdUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "This method will get all Vendors through Data Transfer Objects as a List from the Service and return a VendorListDTO-Object.", nickname = "getVendorListUsingGET", notes = "These are some notes, added to the Operation in the API and listed in smaller letters to the UI tab.", response = VendorListDTO.class, tags={ "vendor-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VendorListDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/v1/vendors",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    ResponseEntity<VendorListDTO> getVendorListUsingGET();


    @ApiOperation(value = "patchCustomer", nickname = "patchCustomerUsingPATCH", notes = "", response = CustomerDTO.class, tags={ "customer-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CustomerDTO.class),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/v1/customers/{id}",
        produces = { "*/*" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<CustomerDTO> patchCustomerUsingPATCH(@ApiParam(value = "customerDTO" ,required=true )  @Valid @RequestBody CustomerDTO customerDTO,@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "The PATCH-Operation with 'id' will update only new values from the input of the vendor-object with the given id.", nickname = "patchVendorUsingPATCH", notes = "", response = VendorDTO.class, tags={ "vendor-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VendorDTO.class),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/v1/vendors/{id}",
        produces = { "*/*" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<VendorDTO> patchVendorUsingPATCH(@ApiParam(value = "id",required=true) @PathVariable("id") Long id,@ApiParam(value = "vendorDTO" ,required=true )  @Valid @RequestBody VendorDTO vendorDTO);


    @ApiOperation(value = "updateCustomer", nickname = "updateCustomerUsingPUT", notes = "", response = CustomerDTO.class, tags={ "customer-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CustomerDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/v1/customers/{id}",
        produces = { "*/*" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<CustomerDTO> updateCustomerUsingPUT(@ApiParam(value = "customerDTO" ,required=true )  @Valid @RequestBody CustomerDTO customerDTO,@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "The PUT-Operation with 'id' will update the vendor with the given id.", nickname = "updateVendorUsingPUT", notes = "", response = VendorDTO.class, tags={ "vendor-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VendorDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/v1/vendors/{id}",
        produces = { "*/*" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<VendorDTO> updateVendorUsingPUT(@ApiParam(value = "id",required=true) @PathVariable("id") Long id,@ApiParam(value = "vendorDTO" ,required=true )  @Valid @RequestBody VendorDTO vendorDTO);

}
