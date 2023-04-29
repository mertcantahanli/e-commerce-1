package kodlama.io.ecommerce.business.abstracts;

import kodlama.io.ecommerce.business.dto.pesponses.create.CreateVerificationCodeResponse;
import kodlama.io.ecommerce.business.dto.pesponses.get.GetVerificationCodeResponse;
import kodlama.io.ecommerce.business.dto.pesponses.get.all.GetAllVerificationCodesResponse;
import kodlama.io.ecommerce.business.dto.pesponses.update.UpdateVerificationCodeResponse;
import kodlama.io.ecommerce.business.dto.requests.create.CreateVerificationCodeRequest;
import kodlama.io.ecommerce.business.dto.requests.update.UpdateVerificationCodeRequest;

import java.util.List;

public interface VerificationCodeService {
    /*

	DataResult<List<VerificationCode>> getAll();

	Result add(VerificationCode verificationCode);
     */
    List<GetAllVerificationCodesResponse> getAll();
    GetVerificationCodeResponse getById(int id);
    CreateVerificationCodeResponse add(CreateVerificationCodeRequest request);
    UpdateVerificationCodeResponse update(int id, UpdateVerificationCodeRequest request);
    void delete(int id);
}
